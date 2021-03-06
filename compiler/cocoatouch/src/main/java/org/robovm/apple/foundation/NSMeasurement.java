/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSMeasurement/*</name>*/ <T extends NSUnit>
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSMeasurementPtr extends Ptr<NSMeasurement, NSMeasurementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSMeasurement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSMeasurement() {}
    protected NSMeasurement(Handle h, long handle) { super(h, handle); }
    protected NSMeasurement(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDoubleValue:unit:")
    public NSMeasurement(double doubleValue, T unit) { super((SkipInit) null); initObject(init(doubleValue, unit)); }
    @Method(selector = "initWithCoder:")
    public NSMeasurement(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "unit")
    public native T getUnit();
    @Property(selector = "doubleValue")
    public native double getDoubleValue();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDoubleValue:unit:")
    protected native @Pointer long init(double doubleValue, T unit);
    @Method(selector = "canBeConvertedToUnit:")
    public native boolean canBeConvertedToUnit(NSUnit unit);
    @Method(selector = "measurementByConvertingToUnit:")
    public native NSMeasurement convertToUnit(NSUnit unit);
    @Method(selector = "measurementByAddingMeasurement:")
    public native NSMeasurement<T> add(NSMeasurement<T> measurement);
    @Method(selector = "measurementBySubtractingMeasurement:")
    public native NSMeasurement<T> substract(NSMeasurement<T> measurement);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
