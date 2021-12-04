package org.bukkit.craftbukkit.v1_16_R3.block.data.type;

import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.craftbukkit.v1_16_R3.block.data.CraftBlockData;

public abstract class CraftNoteBlock extends CraftBlockData implements NoteBlock {

    private static final net.minecraft.state.EnumProperty<?> INSTRUMENT = getEnum("instrument");
    private static final net.minecraft.state.IntegerProperty NOTE = getInteger("note");

    @Override
    public org.bukkit.Instrument getInstrument() {
        return get(INSTRUMENT, org.bukkit.Instrument.class);
    }

    @Override
    public void setInstrument(org.bukkit.Instrument instrument) {
        set(INSTRUMENT, instrument);
    }

    @Override
    public org.bukkit.Note getNote() {
       return new org.bukkit.Note(get(NOTE));
    }

    @Override
    public void setNote(org.bukkit.Note note) {
        set(NOTE, (int) note.getId());
    }
}
