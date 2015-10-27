package org.swtk.commons.dict.wordnet.index.name.instance.w.e.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWEIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"weigela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12702654\"]}");
	add("{\"term\":\"weighbridge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04578244\"]}");
	add("{\"term\":\"weigher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10792945\"]}");
	add("{\"term\":\"weighing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05793072\"]}");
	add("{\"term\":\"weight\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"13610524\", \"13630031\", \"13737860\", \"07554200\", \"04578374\", \"05179849\", \"04578578\", \"05034009\"]}");
	add("{\"term\":\"weightiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05034695\", \"05179849\"]}");
	add("{\"term\":\"weighting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13610524\"]}");
	add("{\"term\":\"weightlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05035866\"]}");
	add("{\"term\":\"weightlift\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00627428\"]}");
	add("{\"term\":\"weightlifter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10793062\"]}");
	add("{\"term\":\"weightlifting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00627428\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }