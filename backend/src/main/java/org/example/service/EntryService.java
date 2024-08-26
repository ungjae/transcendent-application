package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.Entry;
import org.example.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class EntryService {

    private final EntryRepository entryRepository;

    public Optional<Entry> storeNewEntry(BigDecimal input) {
        return Optional.of(entryRepository.save(new Entry(input)));
    }

    public Optional<List<Entry>> getAll() {
        return Optional.of(entryRepository.findAll());
    }
}
