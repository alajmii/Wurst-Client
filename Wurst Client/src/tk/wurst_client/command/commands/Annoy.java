/*
 * Copyright � 2014 - 2015 | Alexander01998 | All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.command.commands;

import tk.wurst_client.command.Command;
import tk.wurst_client.module.modules.AnnoyCMD;

public class Annoy extends Command
{
	private static String[] commandHelp =
	{
		"Annoys a player by repeating everything he says.",
		".annoy",
		".annoy <player>"
	};
	
	public Annoy()
	{
		super("annoy", commandHelp);
	}
	
	@Override
	public void onEnable(String input, String[] args)
	{
		if(args == null)
		{
			AnnoyCMD.onToggledByCommand(null);
			return;
		}else
			AnnoyCMD.onToggledByCommand(args[0]);
	}
}
