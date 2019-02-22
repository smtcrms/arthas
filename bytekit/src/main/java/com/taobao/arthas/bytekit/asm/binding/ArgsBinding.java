package com.taobao.arthas.bytekit.asm.binding;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;

import com.taobao.arthas.bytekit.utils.AsmOpUtils;

public class ArgsBinding extends Binding {

    @Override
    public void pushOntoStack(InsnList instructions, BindingContext bindingContext) {
        AsmOpUtils.loadArgArray(instructions, bindingContext.getMethodProcessor().getMethodNode());
    }

    @Override
    public Type getType(BindingContext bindingContext) {
        return Type.getType(Object[].class);
    }

}