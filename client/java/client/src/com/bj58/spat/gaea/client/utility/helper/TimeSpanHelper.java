/*
 *  Copyright Beijing 58 Information Technology Co.,Ltd.
 *
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package com.bj58.spat.gaea.client.utility.helper;

/**
 * TimeSpanHelper
 *
 * @author Service Platform Architecture Team (spat@58.com)
 */
public class TimeSpanHelper {

    public static int getIntFromTimeSpan(String timeSpan) {
        int returnint = 0;
        String[] times = timeSpan.split(":");
        if(times.length == 3) {
            returnint += Integer.parseInt(times[0]) * 60 * 60 * 1000;
            returnint += Integer.parseInt(times[1]) * 60 * 1000;
            returnint += Integer.parseInt(times[2]) * 1000;
        }
        return returnint;
    }

    public static String getTimeSpanFromInt(int timeSpan) throws Exception {
        throw new Exception("NotImplementedException");
    }
    
    /**
     * 00(秒)
     * 00:00(分:秒)
     * 00:00:00(时:分:秒)
     * 00:00:00:00(时:分:秒:毫秒)
     * @param timeSpan
     * @return
     */
    public static int getIntFromTimeMsSpan(String timeSpan) {
        int returnint = 0;
        String[] times = timeSpan.split(":");
        
        switch (times.length) {
			case 1:
				returnint += Integer.parseInt(times[0]) * 1000;
				break;
			case 2:
				returnint += Integer.parseInt(times[0]) * 60 * 1000;
	            returnint += Integer.parseInt(times[1]) * 1000;
				break;
			case 3:
				returnint += Integer.parseInt(times[0]) * 60 * 60 * 1000;
	            returnint += Integer.parseInt(times[1]) * 60 * 1000;
	            returnint += Integer.parseInt(times[2]) * 1000;
				break;
			case 4:
				returnint += Integer.parseInt(times[0]) * 60 * 60 * 1000;
		        returnint += Integer.parseInt(times[1]) * 60 * 1000;
		        returnint += Integer.parseInt(times[2]) * 1000;
		        returnint += Integer.parseInt(times[3]);
				break;
		}
        
        return returnint;
    }
}