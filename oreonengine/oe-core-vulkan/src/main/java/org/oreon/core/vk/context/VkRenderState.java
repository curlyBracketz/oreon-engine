package org.oreon.core.vk.context;

import org.oreon.core.context.RenderState;
import org.oreon.core.vk.framebuffer.VkFrameBufferObject;
import org.oreon.core.vk.wrapper.buffer.VkUniformBuffer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VkRenderState extends RenderState{

	private VkFrameBufferObject offScreenFbo;
	private VkFrameBufferObject offScreenReflectionFbo;
	private VkFrameBufferObject transparencyFbo;
	private VkFrameBufferObject finalSceneFbo;

	private VkUniformBuffer renderStateUbo;
	
}
