package labs.altice.labseq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import labs.altice.labseq.service.LabSeqService;

@RestController
@RequestMapping("/labseq")
public class LabSeqController {
    @Autowired
    private LabSeqService labSeqService;

    
    @GetMapping("/{n}")
    public int getLabSeqValue(
            @ApiParam(value = "The index of the LabSeq sequence value to return", example = "5")
            @PathVariable int n) {
        return labSeqService.getLabseq(n);
    }
}