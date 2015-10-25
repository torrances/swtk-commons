package org.swtk.commons.dict.wiktionary.generated.m.y.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMYC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mycetism", "{\"term\":\"mycetism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|-mycete|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Poisoning caused by mushrooms\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycobiont", "{\"term\":\"mycobiont\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|myco|biont|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The fungus that is a component of a lichen\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycoherbicide", "{\"term\":\"mycoherbicide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|myco|herbicide|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any bioherbicide based on a fungus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycology", "{\"term\":\"mycology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|myco|ology|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the study of fungi, in the wide sense\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycophilia", "{\"term\":\"mycophilia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|myco|philia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The love of mushrooms\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycoplasma", "{\"term\":\"mycoplasma\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any infectious bacterium of the genus \u0027Mycoplasma\u0027, often specifically\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"title\u003dThe Smallest volume\u003d101|issue\u003d2|page\u003d83|magazine\u003d|url\u003dhttp://www.americanscientist.org/issues/pub/2013/2/the-smallest-cell|passage\u003dIt is likely that the long evolutionary trajectory of \u0027\u0027\u0027Mycoplasma\u0027\u0027\u0027 went from a reductive autotroph to oxidative heterotroph to a cell-wall–defective degenerate parasite. This evolutionary trajectory assumes the simplicity to complexity route of biogenesis, a point of view that is not universally accepted\", \"priority\":2}]}, \"synonyms\":{}}");

	add("mycose", "{\"term\":\"mycose\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Trehalose\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycosis", "{\"term\":\"mycosis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|myco|osis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An infection caused by a fungus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycosymbiont", "{\"term\":\"mycosymbiont\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|myco|symbiont|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any fungus that has a symbiotic relationship with a plant\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycotoxicology", "{\"term\":\"mycotoxicology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study of mycotoxins\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycotoxin", "{\"term\":\"mycotoxin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|myco|toxin|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"any substance, produced by a mold or fungus, that is injurious to vertebrates upon ingestion, inhalation or skin contact\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycovirus", "{\"term\":\"mycovirus\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|myco|virus|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any virus that infects fungi\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mycterism", "{\"term\":\"mycterism\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027μυκτηρισμός\u0027 from \u0027μυκτηρίζω\u0027 (i sneer) from \u0027μυκτήρ\u0027 (nostril)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A gibe; scoffing\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }