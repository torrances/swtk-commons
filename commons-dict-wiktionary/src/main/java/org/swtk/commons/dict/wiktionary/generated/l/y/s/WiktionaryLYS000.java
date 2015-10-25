package org.swtk.commons.dict.wiktionary.generated.l.y.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLYS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lysdexia", "{\"term\":\"lysdexia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Humorous formation from dyslexia by metathesis as if due to dyslexia.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Dyslexia; proneness to metathesis in reading, writing, or speech due to (real or imagined) dyslexia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lysenkoism", "{\"term\":\"lysenkoism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the name of w:Trofim Lysenko|Trofim Lysenko, and \u0027-ism\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The doctrine that maintained that environmentally acquired characteristics could be inherited\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The use of pseudoscience in furtherance of an ideology\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lysis", "{\"term\":\"lysis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From the Latin \u0027lysis\u0027 from the Ancient greek (to 1453) \u0027λύσις\u0027 (a loosening) compare \u0027-lysis\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A gradual recovery from disease (opposed to \u0027\u0027crisis\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1902\u0027\u0027, William James, \u0027The Varieties of Religious Experience\u0027, Folio Society 2008, p. 157\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The older medicine used to speak of two ways, \u0027\u0027\u0027lysis\u0027\u0027\u0027 and \u0027crisis\u0027, one gradual, the other abrupt, in which one might recover from a bodily disease\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The disintegration or destruction of cell\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The breakdown of molecules into constituent molecules\", \"priority\":5}]}, \"synonyms\":{}}");

	add("lysigeny", "{\"term\":\"lysigeny\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Creation of cavities by lysis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lysogeny", "{\"term\":\"lysogeny\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|lyso|geny|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The incorporation of the nucleic acid of a bacteriophage into that of a host bacterium; sometimes transmitted to daughter cells following lysis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lysophospholipid", "{\"term\":\"lysophospholipid\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|lyso|phospholipid|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any derivative of a phospholipid in which one or both acyl derivatives have been removed by hydrolysis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lysosome", "{\"term\":\"lysosome\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|lyso|some|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An organelle found in all types of animal cells which contains a large range of digestive enzymes capable of splitting most biological macromolecules\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lysozyme", "{\"term\":\"lysozyme\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027lyso-\u0027 + \u0027enzyme\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A bacteriolytic (or antibiotic) enzyme found in many animal secretions, and in egg white\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lyssavirus", "{\"term\":\"lyssavirus\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any virus of the genus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lyssophobia", "{\"term\":\"lyssophobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The fear of lyssa, or rabies\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }