package org.swtk.commons.dict.wiktionary.generated.a.l.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryALP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("alpaca", "{\"term\":\"alpaca\", \"etymology\":{\"influencers\":[], \"languages\":[\"Aymara\", \"English\", \"Spanish\"], \"text\":\"From Spanish from Aymara \u0027allpaqa\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A sheep-like animal of the Andes, \u0027Vicugna pacos\u0027, in the camel family, closely related to the llama, guanaco, and vicuña\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"uncountable\u0027) wool from the alpaca\", \"priority\":2}]}, \"synonyms\":{\"list\":[{\"text\":\"paco\", \"synonymQualifier\":\"ARCHAIC\"}]}}");

	add("alpenglow", "{\"term\":\"alpenglow\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"A partial calque of German {{m|de|Alpenglühen}}, with the second element replaced by {{m|en|glow}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A rosy or reddish glow seen during sunset or sunrise on the summits of mountains, especially snow-covered mountains on the opposite side of the sun\", \"priority\":1}]}, \"synonyms\":{}}");

	add("alphagram", "{\"term\":\"alphagram\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Apparently a {{blend|alphabetical|anagram|nocap\u003d1|lang\u003den}}; see also \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The letters of a word, or any other set of letters, arranged into alphabetical order\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027alphagram\u0027\u0027 of the word is \u0026lt;tt\u0026gt;AAABCEHILLPT\u0026lt;/tt\u0026gt\", \"priority\":2}]}, \"synonyms\":{}}");

	add("alphametic", "{\"term\":\"alphametic\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|alphabet|arithmetic|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A puzzle that presents an arithmetic problem with letters in place of the digits, the reader challenged to deduce which digit corresponds to each letter\", \"priority\":1}]}, \"synonyms\":{}}");

	add("alphaprodine", "{\"term\":\"alphaprodine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|alpha|prodine|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of two isomers of prodine\", \"priority\":1}]}, \"synonyms\":{}}");

	add("alphavirus", "{\"term\":\"alphavirus\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any virus of the genus (family Togaviridae\", \"priority\":1}]}, \"synonyms\":{}}");

	add("alprazolam", "{\"term\":\"alprazolam\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"An invented trademark name having elements of \u0027triazole\u0027 and \u0027diazepam\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Category:en:DrugsAn antianxiety drug \u00278-chloro-1-methyl-6-phenyl-4H-[1,2,4]triazolo[4,3-a][1,4]benzodiazepine\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }