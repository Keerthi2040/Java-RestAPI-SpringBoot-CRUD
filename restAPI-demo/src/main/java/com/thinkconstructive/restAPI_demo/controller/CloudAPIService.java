package com.thinkconstructive.restAPI_demo.controller;

import com.thinkconstructive.restAPI_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService
{
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor )
    {
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor )
    {
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId )
    {
        this.cloudVendor=null;
        return "Cloud Vendor Deleted Successfully";
    }
}
