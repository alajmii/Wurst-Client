/*
 * Copyright � 2014 - 2015 | Alexander01998 | All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.darkstorm.minecraft.gui.theme.wurst;

import java.awt.Font;

import net.minecraft.client.gui.FontRenderer;

import org.darkstorm.minecraft.gui.theme.AbstractTheme;

import tk.wurst_client.font.UnicodeFontRenderer;

public class WurstTheme extends AbstractTheme
{
	private final FontRenderer fontRenderer;
	
	public WurstTheme()
	{
		fontRenderer = new UnicodeFontRenderer(new Font("Segoe UI", Font.PLAIN, 15));
		
		installUI(new WurstFrameUI(this));
		installUI(new WurstPanelUI(this));
		installUI(new WurstLabelUI(this));
		installUI(new WurstButtonUI(this));
		installUI(new WurstCheckButtonUI(this));
		installUI(new WurstComboBoxUI(this));
		installUI(new WurstSliderUI(this));
		installUI(new WurstProgressBarUI(this));
	}
	
	public FontRenderer getFontRenderer()
	{
		return fontRenderer;
	}
}
