package org.swtk.commons.dict.wiktionary.generated.k.e.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKES000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kestrel", "{\"term\":\"kestrel\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"old english (ca. 450-1100)\", \"middle dutch (ca. 1050-1350)\", \"English\", \"middle english (1100-1500)\", \"middle french (ca. 1400-1600)\", \"old high german (ca. 750-1050)\", \"old dutch\"], \"text\":\"From Middle english (1100-1500) \u0027castrel\u0027 (staniel, bird of prey) from Middle french (ca. 1400-1600) \u0027cresserelle\u0027 \u0027crecerelle\u0027 (bird of prey) derivative of \u0027crecelle\u0027 (rattle, wooden reel) of obscure origin. {{rel-top|additional etymology}}Derivation from the assumed {{m|la|*crepicella}}, {{m|la|*crepitacillum}}, a diminutive of {{m|la|crepitāculum}}, from {{m|la|crepitāre||to crackle}} is difficult to explain from a morphological point of view. Instead, possibly from a root {{m|frm|*krek-}}, {{m|frm|*krak-||to crack, rattle, creak, emit a bird cry}}, from Middle dutch (ca. 1050-1350) \u0027craken\u0027 from Old dutch {{m|odt|*krakōn||to crack, creak, emit a cry}}, from Proto-germanic {{m|gem-pro|*krakōną||to emit a cry, shout}}, from Proto-indo-european {{m|ine-pro|*gArg-||to shout}}. Cognate with Old high german (ca. 750-1050) {{m|goh|krahhōn||to make a sound, crash}}, Old english (ca. 450-1100) \u0027cracian\u0027 (to resound) Middle french (ca. 1400-1600) \u0027craquer\u0027 (to emit a repeated cry, used of birds) More at {{l|en|creak}}, {{l|en|crack}}.{{rel-bottom}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various small falcons of the genus \u0027Falco\u0027 that hover while hunting\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1878\u0027\u0027, Hardy, \u0027s:The Return of the The Return of the Native\u0027, s:The Return of the Native/Book 3/Chapter book 3 chapter\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"When she was musing she was a \u0027\u0027kestrel\u0027\u0027, which hangs in the air by an invisible motion of its wings\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1917\u0027\u0027, John Masefield, \u0027s:Up on the Up on the Downs\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Up on the downs the red-eyed \u0027\u0027kestrels\u0027\u0027 hover\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Eyeing the grass\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The field mouse flits like a shadow into cove\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"As their shadows pass\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"The common kestrel, \u0027Falco tinnunculus\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }