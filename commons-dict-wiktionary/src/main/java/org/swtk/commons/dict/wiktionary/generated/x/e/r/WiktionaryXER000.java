package org.swtk.commons.dict.wiktionary.generated.x.e.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryXER000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("xeriscape", "{\"term\":\"xeriscape\", \"etymology\":{\"influencers\":[{}], \"languages\":[], \"text\":\"From 1980s \u0027xeriscape\u0027 a term coined (and trademarked) by w:Denver Water|Denver Water. From \u0027xeric\u0027 (dry) + \u0027-scape\u0027 (type of space)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A kind of landscape design for arid regions, minimising the need for irrigation\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1999\u0027\u0027 — w:Neal Neal Stephenson, Cryptonomicon\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Randy looks up over the Impala and the retaining wall and the ice-clogged \u0027\u0027xeriscape\u0027\u0027 above that and into the lobby of Waterhouse House, where Amy Shaftoe has her feet up on a coffee table and is looking through some of the extremely sad Cayuse-related literature that Randy bought for Avi\", \"priority\":3}]}, \"synonyms\":{}}");

	add("xeroderma", "{\"term\":\"xeroderma\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|xero|derma|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"any of various skin diseases characterised by dry hard scaly skin, especially ichthyosis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("xerodermia", "{\"term\":\"xerodermia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|xero|dermia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"xeroderm\", \"priority\":1}]}, \"synonyms\":{}}");

	add("xerography", "{\"term\":\"xerography\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|xero|graphy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a photocopying process in which a negative image formed on an electrically charged plate is transferred as a positive to paper and thermally fixed\", \"priority\":1}]}, \"synonyms\":{}}");

	add("xeromammography", "{\"term\":\"xeromammography\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|xero|mammography|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A photoelectric method of recording an X-ray image on a coated metal plate, using low-energy photon beams, long exposure time, and dry chemical developers\", \"priority\":1}]}, \"synonyms\":{}}");

	add("xerophagia", "{\"term\":\"xerophagia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|xero|phagia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The eating of dry food\", \"priority\":1}]}, \"synonyms\":{}}");

	add("xerophthalmia", "{\"term\":\"xerophthalmia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|xero|ophthalmia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A condition due to a deficiency of vitamin A where the conjunctiva and cornea become dry. The condition starts with conjunctival xerosis and night blindness and progresses to corneal xerosis and, later, a severe condition called keratomalacia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("xeroradiography", "{\"term\":\"xeroradiography\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A method of X-ray photography which uses an electrically charged metal plate instead of film\", \"priority\":1}]}, \"synonyms\":{}}");

	add("xerulin", "{\"term\":\"xerulin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A polyunsaturated, acetylenic lactone, produced by \u0027Basidiomycetes\u0027 bacteria, that inhibits cholesterol biosynthesis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("xerxes", "{\"term\":\"xerxes\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"old persian (ca. 600-400 b.c.)\"], \"text\":\"From Ancient greek (to 1453) \u0027ξέρξης\u0027 from Old persian (ca. 600-400 b.c.) \u0027𐎧𐏁𐎹𐎠𐎼𐏁𐎠\u0027 (ruler among kings)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Xerxes I, a Persian king of the Achaemenid dynasty who reigned 485-465 BC\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Xerxes II, a Persian king who ruled for 45 days in 424 BC before being assassinated\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"mainly applied to historical and fictional characters\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }