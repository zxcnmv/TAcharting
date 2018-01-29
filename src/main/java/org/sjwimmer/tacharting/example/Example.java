/*
 GNU Lesser General Public License

 Copyright (c) 2017 Wimmer, Simon-Justus

 Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 to permit persons to whom the Software is furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.sjwimmer.tacharting.example;

import com.sun.javafx.application.LauncherImpl;
import org.sjwimmer.tacharting.chart.AbstractProgram;
import org.sjwimmer.tacharting.chart.Preloader;
import org.sjwimmer.tacharting.chart.ProgramStart;

/**
 * Example class with main entry point that launch the charting application
 * with an Example class that extends the AbstractProgram
 */
public class Example {

    /**
     * launch the Application {@link ProgramStart} that extends the
     * {@link AbstractProgram AbstractProgram}
     * @param args command line arguments
     */
    public static void main(String[] args){
        LauncherImpl.launchApplication(ProgramStart.class, Preloader.class, args);
    }
}
