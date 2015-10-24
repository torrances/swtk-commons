package org.swtk.commons.dict.wiktionary.generated.f.o.x;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFOX000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("foxberry", "{\"term\":\"foxberry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|fox|berry|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The plant cowberry or lingonberry, \u0027Vaccinium vitis-idaea\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The berry of this plant\", \"priority\":2}]}, \"synonyms\":{}}");

	add("foxhunt", "{\"term\":\"foxhunt\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|fox|hunt|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hunt for foxes; normally with dogs\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A hunt for radio transmitters; radiosport\", \"priority\":2}]}, \"synonyms\":{}}");

	add("foxtail", "{\"term\":\"foxtail\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|fox|tail|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The tail of a fox\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A dry spikelet or spikelet seed and flower cluster of some grasse\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A plant having a part resembling the tail of a fox or such spikelet\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Any of various grasses having bushy seed spikelets that resemble the tail of a fo\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Look at the \u0027\u0027foxtails\u0027\u0027 growing along the road\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"species of genus \u0027Alopecurus\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"species of \u0027Setaria\u0027, foxtail millets\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Hordeum jubatum\u0027, foxtail barley\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"chenille plant\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"and , foxtail clubmosses\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"The last cinders obtained in the fining process\", \"priority\":11}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }