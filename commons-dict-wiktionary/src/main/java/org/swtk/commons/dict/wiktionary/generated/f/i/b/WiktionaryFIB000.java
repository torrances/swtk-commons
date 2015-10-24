package org.swtk.commons.dict.wiktionary.generated.f.i.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFIB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fiber", "{\"term\":\"fiber\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From French \u0027fibre\u0027 () from Old french (842-ca. 1400) from Latin \u0027fibra\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A single elongated piece of a given material, roughly round in cross-section, often twisted with other fibers to form thread\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The microscope showed a single blue \u0027\u0027fiber\u0027\u0027 stuck to the sole of the shoe\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A material in the form of fibers\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The cloth is made from strange, somewhat rough \u0027\u0027fiber\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A material whose length is at least 1000 times its width\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Please use polyester \u0027\u0027fiber\u0027\u0027 for this shirt\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"dietary Dietary fiber\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Fresh vegetables are a good source of \u0027\u0027fiber\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Moral strength and resolve\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"The ordeal was a test of everyone\u0027s \u0027\u0027fiber\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"The preimage of a given point in the range of a map\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"Under this map, any two values in the \u0027\u0027fiber\u0027\u0027 of a given point on the circle differ by 2\u0026amp;pi\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"A kind of lightweight thread of execution\", \"priority\":13}]}, \"synonyms\":{}}");

	add("fibrin", "{\"term\":\"fibrin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|fibre|in|gloss2\u003dused to form chemical names of proteins, etc|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A white, albuminous, fibrous substance, formed in the coagulation of the blood\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An elastic, insoluble, whitish protein produced by the action of thrombin on fibrinogen and forming an interlacing fibrous network in the coagulation of blood\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An albuminous body, resembling animal fibrin in composition, found in cereal grains and similar seeds; vegetable fibrin\", \"priority\":3}]}, \"synonyms\":{}}");

	add("fibroblast", "{\"term\":\"fibroblast\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|fibro|blast|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a cell found in connective tissue that produces fibers, such as collagen\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fibrocyte", "{\"term\":\"fibrocyte\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|fibro|cyte|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An inactive connective tissue cell that is capable of forming collagen\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fibrodysplasia", "{\"term\":\"fibrodysplasia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|fibro|dysplasia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Abnormal development of fibrous tissue\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fibromyalgia", "{\"term\":\"fibromyalgia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|fibro|myalgia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Chronic pain, stiffness, and tenderness of the muscles, tendons, and joints\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fibrosarcoma", "{\"term\":\"fibrosarcoma\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|fibro|sarcoma|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fibroblastic sarcoma: a malignant tumor derived from fibrous connective tissue\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }