package org.example.controller;

import org.example.repository.ArrLists;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.exceptions.base.MockitoException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MainControllerTest {

    @Test
    void btnClick() {
        MainController mainControllerMock = mock(MainController.class);
        mainControllerMock.btnClick();
        verify(mainControllerMock, times(1)).btnClick();
    }
}