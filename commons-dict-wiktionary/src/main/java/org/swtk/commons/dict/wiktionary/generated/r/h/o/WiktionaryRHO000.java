package org.swtk.commons.dict.wiktionary.generated.r.h.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRHO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("rhombomere", "{\"term\":\"rhombomere\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|rhombo|mere|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A temporarily divided segment of the developing neural tube, within the hindbrain region\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rhone", "{\"term\":\"rhone\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A horizontal section of guttering, collecting rainwater from a roof\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rhonchus", "{\"term\":\"rhonchus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027rhonchus\u0027 ‘snoring’, from Ancient greek (to 1453) \u0027ῥόγχος\u0027 (Caelius Aurelianus),\u0026lt;ref\u0026gt;Robert Beekes, \u0027Etymological Dictionary of Greek\u0027, vol. II (Leiden: Brill, 2010), 1278.\u0026lt;/ref\u0026gt; of imitative origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dry rattling sound heard during breathing, due to deposits in the bronchial tubes\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Thomas Pynchon, \u0027Against the Day\u0027, Vintage 2007, p. 699\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"“You have poisoned yourself again!” Humfried emitted an alarming \u0027\u0027rhonchus\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }