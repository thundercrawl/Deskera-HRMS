/*
 * Copyright (C) 2012  Krawler Information Systems Pvt Ltd
 * All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/
package com.krawler.hrms.compennsation;
// Generated Jun 17, 2009 11:27:33 AM by Hibernate Tools 3.2.1.GA

import com.krawler.common.admin.User;
import com.krawler.hrms.master.MasterData;




/**
 * Compensation generated by hbm2java
 */
public class Compensation  implements java.io.Serializable {


     private String comid;
     private User empcompen;
     private User mancompen;
     private String comcsal;
     private String comnsal;
     private String comprat;
     private String comdate;
     private String compi;
     private String comdi;
     private String promotion;
     private MasterData promotionid;
     private MasterData performanceid;

    public Compensation() {
    }

    public Compensation(String comid, User empcompen, User mancompen, String comcsal, String comnsal, String comprat, String comdate, String compi, String comdi, String promotion, MasterData promotionid, MasterData performanceid) {
        this.comid = comid;
        this.empcompen = empcompen;
        this.mancompen = mancompen;
        this.comcsal = comcsal;
        this.comnsal = comnsal;
        this.comprat = comprat;
        this.comdate = comdate;
        this.compi = compi;
        this.comdi = comdi;
        this.promotion = promotion;
        this.promotionid = promotionid;
        this.performanceid = performanceid;
    }

    public String getComcsal() {
        return comcsal;
    }

    public void setComcsal(String comcsal) {
        this.comcsal = comcsal;
    }

    public String getComdate() {
        return comdate;
    }

    public void setComdate(String comdate) {
        this.comdate = comdate;
    }

    public String getComdi() {
        return comdi;
    }

    public void setComdi(String comdi) {
        this.comdi = comdi;
    }

    public String getComid() {
        return comid;
    }

    public void setComid(String comid) {
        this.comid = comid;
    }

    public String getComnsal() {
        return comnsal;
    }

    public void setComnsal(String comnsal) {
        this.comnsal = comnsal;
    }

    public String getCompi() {
        return compi;
    }

    public void setCompi(String compi) {
        this.compi = compi;
    }

    public String getComprat() {
        return comprat;
    }

    public void setComprat(String comprat) {
        this.comprat = comprat;
    }

    public User getEmpcompen() {
        return empcompen;
    }

    public void setEmpcompen(User empcompen) {
        this.empcompen = empcompen;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public User getMancompen() {
        return mancompen;
    }

    public void setMancompen(User mancompen) {
        this.mancompen = mancompen;
    }

    public MasterData getPromotionid() {
        return promotionid;
    }

    public void setPromotionid(MasterData promotionid) {
        this.promotionid = promotionid;
    }

    public MasterData getPerformanceid() {
        return performanceid;
    }

    public void setPerformanceid(MasterData performanceid) {
        this.performanceid = performanceid;
    }
}


