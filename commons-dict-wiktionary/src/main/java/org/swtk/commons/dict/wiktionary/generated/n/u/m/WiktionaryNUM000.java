package org.swtk.commons.dict.wiktionary.generated.n.u.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNUM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("numbness", "{\"term\":\"numbness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|numb|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Absent or reduced sensitivity to cutaneous stimulation\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Inability or reduced ability to experience emotion\", \"priority\":2}]}, \"synonyms\":{}}");

	add("numen", "{\"term\":\"numen\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|numen|nūmen}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a divinity, especially a local or presiding go\", \"priority\":1}]}, \"synonyms\":{}}");

	add("numeral", "{\"term\":\"numeral\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"Latin\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027numeral\u0027 from Latin {{m|la|numerālis||pertaining to a number}}, from \u0027numerus\u0027 (a number)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A symbol that is not a word and represents a number, such as the Arabic numerals 1, 2, 3 and the Roman numerals I, V, X, L\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A word representing a number\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027 — Laurie Bauer \u0026amp; Rodney Huddleston, \u0026quot;Lexical word-formation\u0026quot;, p1621-1722 in \u0027The Cambridge Grammar of the English Language\u0027, p171\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"We use the term \u0027\u0027numeral\u0027\u0027 for linguistic expressions and \u0027\u0027number\u0027\u0027 for meanings. For example, \u0027five\u0027 is a \u0027\u0027numeral\u0027\u0027 expressing the number \u0026quot;5\u0026quot; - and \u0027fifteen hundred\u0027 and \u0027one thousand five hundred\u0027 are different \u0027\u0027numerals\u0027\u0027 expressing the same number, \u0026quot;1,500\u0026quot\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A card whose rank is a number (usually including the ace as 1\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Jacks, queens, and kings are not \u0027\u0027numerals\", \"priority\":6}]}, \"synonyms\":{}}");

	add("numeration", "{\"term\":\"numeration\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of counting or numbering things; enumeration\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Any system of giving names to numbers\", \"priority\":2}]}, \"synonyms\":{}}");

	add("numericlature", "{\"term\":\"numericlature\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A system of nomenclature based on numbers\", \"priority\":1}]}, \"synonyms\":{}}");

	add("numerousness", "{\"term\":\"numerousness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|numerous|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being numerous\", \"priority\":1}]}, \"synonyms\":{}}");

	add("numismatics", "{\"term\":\"numismatics\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\"], \"text\":\"From French \u0027numismatique\u0027 from \u0027numisma\u0027 \u0027numismatis\u0027 (coin) variant of Latin \u0027nomisma\u0027 from Ancient greek (to 1453) \u0027νόμισμα\u0027 (current coin, custom) from \u0027νομίζω\u0027 (i hold or own as a custom, usage, i use customarily, practise, i am used to) from \u0027νόμος\u0027 (usage, custom) from \u0027νέμω\u0027 (i keep, hold, watch)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study of coins (or of medals\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The collecting of coins (or of medals\", \"priority\":2}]}, \"synonyms\":{}}");

	add("numismatist", "{\"term\":\"numismatist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|numismatics|ist|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who studies and/or collects coins and/or currencies\", \"priority\":1}]}, \"synonyms\":{}}");

	add("numpty", "{\"term\":\"numpty\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Possibly from Scottish English \u0027numbskull\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An idiot, dolt or fool\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }