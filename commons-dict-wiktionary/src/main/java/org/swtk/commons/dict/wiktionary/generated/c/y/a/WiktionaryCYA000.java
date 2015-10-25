package org.swtk.commons.dict.wiktionary.generated.c.y.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCYA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cyan", "{\"term\":\"cyan\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"Ancient greek (to 1453) \u0027κύανος|lang\u003dgrc\u0027 () probably a non Indo-European word, but perhaps akin to, or from, Hittite *\u0027kuwanna(n)-\u0027 \u0026quot;copper blue.\u0026quot;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A colour between blue and green in the visible spectrum; the complementary colour of red; the colour obtained by subtracting red from white light\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cyamemazine", "{\"term\":\"cyamemazine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A typical antipsychotic of the phenothiazine class\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cyanide", "{\"term\":\"cyanide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|cyano|ide|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any compound containing the -C≡N radical or the C≡N\u0026lt;sup\u0026gt;-1\u0026lt;/sup\u0026gt; anion\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"potassium cyanide - a water soluble poiso\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"hydrogen cyanide, or cyanide gas - a poisonous gas\", \"priority\":3}]}, \"synonyms\":{}}");

	add("cyanopindolol", "{\"term\":\"cyanopindolol\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|cyano|pindolol|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A drug related to pindolol which acts as both a β1 adrenoreceptor antagonist and a 5-HT1A receptor antagonist\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cyanosis", "{\"term\":\"cyanosis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From See cyanic.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A blue discolouration of the skin due to the circulation of blood low in oxygen\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cyanurate", "{\"term\":\"cyanurate\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|cyanuric|ate|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A compound formed with cyanuric aci\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"melamine \u0027\u0027cyanurate\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The anion formed by the deprotonation of cyanuric aci\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"sodium \u0027\u0027cyanurate\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }