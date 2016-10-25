# Android Mockito JUnit runner

An implementation of JUnit runner that combines `AndroidJUnit4` and `MockitoJUnit44Runner`.

There is a limitation where you can not set `timeout_msec` parameter that is included with `AndroidJUnit4` runner.

In order for this to work you should use Kamino implementation of [dexmaker](https://github.com/kaminomobile/dexmaker).

## Dependencies

```
dependencies {
    androidTestCompile 'solar.blaz.android.test:android-mockito-runner:1.0'
}
```

## Usage

Instead of using `@RunWith(AndroidJUnit4.class)` to annotate you Android test classes you should use `@RunWith(MockitoAndroidJUnit4.class)`.
After that you just annotate fiedls with `@Mock` and mock will be set up for you.

## License

    MIT License

    Copyright (c) 2016 Blaž Šolar

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
