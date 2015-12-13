package com.horstmann.violet.framework.util.string.decorator;

import com.horstmann.violet.framework.util.string.OneLineString;

/**
 * Created by Adrian Bobrowski on 12.12.2015.
 */
public class BoldOneLineStringDecorator extends OneLineStringDecorator {

    public BoldOneLineStringDecorator(OneLineString decoratedOneLineString)
    {
        super(decoratedOneLineString);
    }

    public BoldOneLineStringDecorator(OneLineString decoratedOneLineString, String regex)
    {
        super(decoratedOneLineString, regex);
    }

    @Override
    public String toHTML()
    {
        return getHtml("<b>", "</b>");
    }
}