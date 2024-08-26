package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.Entry;
import org.example.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/entries")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class EntryController {

    private final EntryService entryService;

    @GetMapping
    public ResponseEntity<List<Entry>> getAll() {
        return ResponseEntity.of(entryService.getAll());
    }

    @PostMapping("/{input}")
    public ResponseEntity<Entry> storeEntry(@PathVariable BigDecimal input) {
        return ResponseEntity.of(entryService.storeNewEntry(input));
    }
}
