package org.swtk.commons.dict.wiktionary.generated.d.w.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDWA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dwale", "{\"term\":\"dwale\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) \u0027dwale\u0027 (dazed, stupor; deception, trickery; delusion; error, wrong-doing, evil) from Old english (ca. 450-1100) \u0027dwala\u0027 () \u0027dwola\u0027 (error, heresy; doubt; madman, deceiver, heretic) and possibly of Scandinavian origin, compare Danish dvale ‘sleep, stupor’.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a sleeping-potion, especially one made from belladonn\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Late 14th century\u0027\u0027, Geoffrey Chaucer, \u0027The Reeve\u0027s Tale\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"To bedde goþ Aleyne and also John; / Þer nas na moore – hem nedede no \u0027\u0027dwale\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"belladonna itself, deadly nightshade; or some other soporific plan\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1842\u0027\u0027, J. van Voorst, \u0027The Phytologist\u0027, p. 595\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Beneath and around the clumps of ragged moss-grown elder and hoary stunted whitethorn (...) rise thickets of tall nettles and rank hemlock, concealing the deadly but alluring \u0027\u0027dwale\u0027\u0027 —\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"error, delusion \u0026lt;!--Century Dict--\u0026gt\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"a sable or black color. \u0026lt;!--Century Dict--\u0026gt\", \"priority\":8}]}, \"synonyms\":{}}");

	add("dwang", "{\"term\":\"dwang\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From Dutch. Dutch|dwang\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A horizontal timber (or steel) section used in the construction of a building\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A large metal crowbar\", \"priority\":2}]}, \"synonyms\":{}}");

	add("dwarfdom", "{\"term\":\"dwarfdom\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The world of dwarfs (mythical creatures\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The state of being a dwarf (the star, or the mythical creature\", \"priority\":2}]}, \"synonyms\":{}}");

	add("dwarfism", "{\"term\":\"dwarfism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|dwarf|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being a dwarf\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1985\u0027\u0027, J. D. Esko \u0027et al.\u0027, \u0026quot;Animal Cell Mutants Defective in Glycosaminoglycan Biosynthesis,\u0026quot; \u0027Proceedings of the National Academy of Sciences of the United States of America\u0027, vol. 82, no. 10, p. 3200\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Studies of disproportionate \u0027\u0027dwarfisms\u0027\u0027 in animals have revealed the importance of core proteins an sulfation in the development of cartilage\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }