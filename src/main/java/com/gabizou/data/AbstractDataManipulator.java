package com.gabizou.data;

import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;

public abstract class AbstractDataManipulator<TManipulator extends DataManipulator<TManipulator, TImmutable>, TImmutable extends ImmutableDataManipulator<TImmutable, TManipulator>> implements DataManipulator<TManipulator, TImmutable> {


}