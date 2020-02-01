# Slide to unlock
Slide-to-unlock layout for Android

![test](https://github.com/TejusAcentria/SwipeButtonView.git)

### Usage:

Layout:

```xml
   <com.techgen.tejus.slidetounlock.SlideLayout
            android:id="@+id/slide2"
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:layout_marginTop="12dp">

            <TextView
                android:id="@+id/txt_text"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="#000"
                android:textSize="18sp"
                android:textStyle="bold"
                android:text="Hello, world"
                android:layout_marginRight="12dp"
                android:layout_gravity="center_horizontal|center_vertical"/>

            <FrameLayout
                android:id="@+id/slide_child"
                android:layout_width="60dp"
                android:layout_height="match_parent"
                >

                <View
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_marginLeft="1px"
                    android:layout_marginTop="1px"
                    android:layout_marginBottom="1px"
                    android:layout_marginRight="1px"
                    android:background="@drawable/button_bg"
                    />

                <ImageView
                    android:layout_width="48dp"
                    android:layout_height="48dp"
                    android:tint="#fff"
                    android:layout_marginRight="6dp"
                    android:layout_gravity="center_vertical|right"
                    android:src="@drawable/ic_slide"/>

            </FrameLayout>

        </com.techgen.tejus.slidetounlock.SlideLayout>


```

Code:

```java
SlideLayout slider = (SliderLayout) findViewById(R.id.slider2);
slider.setRenderer(new ScaleRenderer());
slider.setSlider(new HorizontalSlider());
slider.addSlideListener(new ISlideListener() {
  @Override
    public void onSlideDone(SlideLayout slider, boolean done) {
        if (done) {
            // restore start state
            slider.reset();
        }
    }
});
```

Additional methods:
- setRenderer() - sets the way of the SlideLayout updating (now available: ScaleRenderer and TranslateRenderer)
- setSlider() - sets the slider for SlideLayout. There are HorizontalSlider, VerticalSlider, RadialSlider and RectangleSlider.

See the source code of 'app' module for usage details.
# SwipeToAct
