package org.swtk.commons.dict.wiktionary.generated.n.a.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNAS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nasalization", "{\"term\":\"nasalization\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|nasalize|ation|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the articulation of a vowel or continuant consonant in such a way that air flows through the nose at the same time as it flows through the mout\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a particular instance of such chang\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"eclipsis\", \"priority\":3}]}, \"synonyms\":{}}");

	add("nasalness", "{\"term\":\"nasalness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|nasal|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being nasal\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"nasalness\u0027\u0027 of a consonant\", \"priority\":2}]}, \"synonyms\":{}}");

	add("nashville", "{\"term\":\"nashville\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The capital and second largest city of Tennessee, known as the center of the country music industry\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The country music industry\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A city in Arkansa\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A city in Georgia, US\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A city in Illinoi\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A town in Indian\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A city in Kansa\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A village in Michiga\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"A hamlet in New Yor\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A town in North Carolin\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"A village in Ohi\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"A hamlet in Ontari\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"A ghost town in Texa\", \"priority\":13},{\"upperType\":\"NOUN\", \"text\":\"A town and an unincorporated community in Wisconsin\", \"priority\":14}]}, \"synonyms\":{}}");

	add("naskh", "{\"term\":\"naskh\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027نَسْخ\u0027 (copy)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a cursive style of Arabic calligraphy or font, the one most popular for and characteristic of the Arabic language itself\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nasology", "{\"term\":\"nasology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The scientific study of the nose\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nasopharyngitis", "{\"term\":\"nasopharyngitis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An inflammation of the nasal passages, and of the upper pharynx\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nassau", "{\"term\":\"nassau\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"German\", \"English\"], \"text\":\"Named after {{w|Nassau, Germany}} and ultimately from German \u0027nass\u0027 (wet)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The capital of the Bahamas\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nasserism", "{\"term\":\"nasserism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Nasser|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An Arab nationalist political ideology based on the thinking of the former Egyptian President\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nastika", "{\"term\":\"nastika\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Sanskrit\"], \"text\":\"From Sanskrit \u0027sc\u003ddeva|नास्तिक|tr\u003dnāstika\u0027 (atheistical, infidel) negating the meaning of \u0027sc\u003ddeva|आस्तिक|tr\u003dāstika\u0027 (orthodox, believing, pious, faithful)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Technical term in Hinduism used to classify philosophical schools and persons, according to whether they accept the authority of the Vedas as supreme revealed scriptures, or not\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }