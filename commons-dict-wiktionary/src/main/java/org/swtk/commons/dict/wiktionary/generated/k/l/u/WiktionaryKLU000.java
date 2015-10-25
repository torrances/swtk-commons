package org.swtk.commons.dict.wiktionary.generated.k.l.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKLU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kludge", "{\"term\":\"kludge\", \"etymology\":{\"influencers\":[], \"languages\":[\"Danish\", \"German\", \"English\", \"scots\"], \"text\":\"Perhaps from British military slang, possibly based on a Scots word \u0027\u0027 or \u0027kludgie\u0027 () or perhaps from German {{m|de|klug||clever}}. Alternatively, possibly related to Polish and Russian {{m|pl|klucz||a key, a hint, a main point}}. Alternatively, perhaps from to Dutch low saxon {{m|nds-nl|klütje||(little) dumpling, clod}}, Jutland Danish {{m|da|klyt||piece of bad workmanship, klud(g)e}}; compare and standard Danish {{m|da|kludder||mess, disorder}}. (Compare \u0027klutz\u0027.)There is evidence that {{m|en|kluge}} (which see) was once a separate word with similar meaning but separate derivation, but the spelling \u0027\u0027 was widely popularized in the US by a 1962 \u0027w:Datamation|Datamation\u0027 article on “How to Design a Kludge”, and since then the two words have often been used as alternative spellings of each other.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An improvised device, usually crudely constructed. Typically used to test the validity of a principle before doing a finished design\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Any construction or practice, typically inelegant, designed to solve a problem temporarily or expediently\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An amalgamated mass of totally unrelated parts forming a distressing whole\", \"priority\":3}]}, \"synonyms\":{}}");

	add("kluge", "{\"term\":\"kluge\", \"etymology\":{\"influencers\":[], \"languages\":[\"Danish\", \"German\", \"English\"], \"text\":\"From US military slang, possibly from German {{m|de|klug||clever}}, or perhaps from to Dutch low saxon {{m|nds-nl|klütje||(little) dumpling, clod}}, Jutland Danish {{m|da|klyt||piece of bad workmanship, klud(g)e}}; compare and standard Danish {{m|da|kludder||mess, disorder}}. (Compare \u0027klutz\u0027.)Compare {{m|en|kludge}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Something that should not work, but does\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A device assembled from components intended for disparate purposes\", \"priority\":2}]}, \"synonyms\":{}}");

	add("kluski", "{\"term\":\"kluski\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Polish\"], \"text\":\"From Polish\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Noodles prepared in an ethnic Polish manner, specifically, thin strips of dough, as opposed to filled shells\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }