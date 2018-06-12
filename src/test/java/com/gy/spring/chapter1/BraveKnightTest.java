package com.gy.spring.chapter1;

import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class BraveKnightTest {

    @Test
    public void embarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}