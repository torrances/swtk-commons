package org.swtk.commons.dict.wiktionary.generated.d.i.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDIB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dibaryon", "{\"term\":\"dibaryon\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|di|baryon|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of a proposed class of particles that would be a complex of two baryons (or six quarks\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dibber", "{\"term\":\"dibber\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a tool with a handle on one end and a point on the other, used in the garden to poke holes in preparation for planting seeds, bulbs, etc. Also known as a dibble or dib\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1850\u0027\u0027, \u0027The Journal of the Horticultural Society of London\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In dry weather, when plants are drawn out of the seed bed, and planted with a common \u0027\u0027dibber\u0027\u0027, receiving daily dribblings of water, many will perish, and all are materially injured\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"one who dibs\", \"priority\":4}]}, \"synonyms\":{}}");

	add("dibbler", "{\"term\":\"dibbler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|dibble|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small Australian marsupial of the genus (), somewhat reminiscent of a mouse\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A dibble (device for making holes in which to plant seeds\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A person who uses a dibble\", \"priority\":3}]}, \"synonyms\":{}}");

	add("dibenzoyl", "{\"term\":\"dibenzoyl\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Two benzoyl groups in a molecule\", \"priority\":1}]}, \"synonyms\":{}}");

	add("diborane", "{\"term\":\"diborane\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"boron hydride, B\u0026lt;sub\u0026gt;2\u0026lt;/sub\u0026gt;H\u0026lt;sub\u0026gt;6\u0026lt;/sub\u0026gt;, a colourless explosive gas with a nasty smell; it has an unusual structure in which two of the hydrogen atoms form a bridge between the two boron atoms\", \"priority\":1}]}, \"synonyms\":{}}");

	add("diboron", "{\"term\":\"diboron\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Two boron atoms in a molecule\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dibutyl", "{\"term\":\"dibutyl\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Two butyl groups in a molecule\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }