package org.swtk.commons.dict.wiktionary.generated.a.d.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryADR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("adrafinil", "{\"term\":\"adrafinil\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A mild stimulant of the central nervous system used to relieve excessive sleepiness and inattention in elderly patients\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adrenalin", "{\"term\":\"adrenalin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Category:en:HormonesCategory:en:Neurotransmitters\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adrenaline", "{\"term\":\"adrenaline\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|adrenal|ine|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An alternative name for epinephrine; the hormone and neurotransmitter\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adrenalitis", "{\"term\":\"adrenalitis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From adrenal + -itis\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Inflammation of one or both adrenal glands, leading to an insufficiency of cortisol and/or aldosterone\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adrenarche", "{\"term\":\"adrenarche\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A stage of maturation of the cortex of the human adrenal glands, related to puberty, typically occurring between the ages of six and ten years and involving both structural and functional changes\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adrenomedullin", "{\"term\":\"adrenomedullin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A peptide associated with a pheochromocytoma\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adrenorphin", "{\"term\":\"adrenorphin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An endogenous, C-terminally amidated, opioid octapeptide, produced from proteolytic cleavage of proenkephalin A and widely distributed throughout the mammalian brain\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adriamycin", "{\"term\":\"adriamycin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An anthracycline antibiotic drug used in cancer chemotherapy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adrian", "{\"term\":\"adrian\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"etruscan\", \"Latin\"], \"text\":\"From Latin {{m|la|Hadrianus||from the Roman harbor Hadria}} a place name ultimately from Etruscan {{m|ett|𐌇𐌀𐌕𐌓𐌉𐌀}}. See {{w|Adria}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Scene 1\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Which, of he or \u0027\u0027Adrian\u0027\u0027, for a good wager, first begins to crow\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1874\u0027\u0027 Bertha de Jongh, \u0027The Sisters Lawless, by the author of Rosa Noel\u0027, page 245\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"quot;My only worth will be in always remembering to do the thing that pleases you; and yet, although I don\u0027t really like Adie, it has a more home-like, more whisperable sound than \u0027\u0027Adrian\u0027\u0027. \u0027\u0027Adrian\u0027\u0027 is a grand, heroic sort of a name, yet what a beautiful name it is\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1912\u0027\u0027 , Adrian\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"His baptismal register spoke of him pessimistically as John Henry, but he had left that behind with the other maladies of infancy, and his friends knew him under the front-name of \u0027\u0027Adrian\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A city in Georgia, USA\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A city in Michigan\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"A city in Minnesota\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A city in Missouri\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"A hamlet in New York\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"A city in Oregon\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"A city in Texas\", \"priority\":13},{\"upperType\":\"NOUN\", \"text\":\"A town in Wisconsin\", \"priority\":14}]}, \"synonyms\":{}}");

	add("adroitness", "{\"term\":\"adroitness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|adroit|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"skillfulness or ease of ability\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }