package org.swtk.commons.dict.wiktionary.generated.p.o.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPOO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pood", "{\"term\":\"pood\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\"], \"text\":\"From Russian \u0027lang\u003dru\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An obsolete Russian unit of mass, equal to 40 Russian фун\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"funt, or about 16.38 kg (approximately 36.11 pounds\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A Russian unit of mass used for kettlebells, now rounded off to 16 kg (about 35.274 pounds\", \"priority\":3}]}, \"synonyms\":{}}");

	add("poobah", "{\"term\":\"poobah\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027Pooh-Bah\u0027, a comic character in the w:Gilbert and Sullivan|Gilbert \u0026amp; Sullivan operetta \u0027{{w|The Mikado}}\u0027 (1885), formed as {{compound|pooh|bah|lang\u003den}}, both expressing contempt. Libretto by {{w|W. S. Gilbert}}, preceded by character \u0027Pish-Tush-Pooh-Bah\u0027 (described as “haughty”) in “King Borriah Bungalee Boo” (1866), one of the \u0027{{w|Bab Ballads}},\u0027 with \u0027pish\u0027 and \u0027tush\u0027 other terms of contempt.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who holds multiple offices or positions of power at the same time\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A leader or other important person\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A pompous, self-important person\", \"priority\":3}]}, \"synonyms\":{}}");

	add("pooch", "{\"term\":\"pooch\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Of {{unk.|en|title\u003duncertain}} origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dog of mixed breed, a mongre\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A bulge, an enlarged par\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"There\u0027s a \u0027\u0027pooch\u0027\u0027 in the plastic where it got too hot\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A distended or swelled condition\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Her left sleeve has more \u0027\u0027pooch\u0027\u0027 at the shoulder than the right\", \"priority\":5}]}, \"synonyms\":{}}");

	add("poodle", "{\"term\":\"poodle\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From German {{m|de|Pudel}}, a shortened form of {{m|de|Pudelhund}}, a compound of {{m|de|Hund||dog}} and the German low german term {{m|nds-de|Pudel}}, {{m|nds-de|Puudel|Pūdel|puddle}}, from the onomatopoeic term {{m|de|pudeln||to splash about}}.\u0026lt;ref\u0026gt;[http://www.duden.de/rechtschreibung/Pudel duden Online: Pudel], [http://www.duden.de/rechtschreibung/pudeln Duden Online: pudeln]\u0026lt;/ref\u0026gt;\u0026lt;ref\u0026gt;[http://www.dwds.de/?qu\u003dPudel Digitales Wörterbuch der deutschen Sprache]\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a breed of dog originating in Europe as hunting dogs, and having heavy, curly coat in a solid color; their shoulder height indicates their classification as standard, medium, miniature, or toy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pooling", "{\"term\":\"pooling\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Grouping together of various resources or assets\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pooping", "{\"term\":\"pooping\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of a wave (or other vessel) striking the stern of a vessel\", \"priority\":1}]}, \"synonyms\":{}}");

	add("poopskin", "{\"term\":\"poopskin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|poop|skin|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person with dark-coloured skin\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }