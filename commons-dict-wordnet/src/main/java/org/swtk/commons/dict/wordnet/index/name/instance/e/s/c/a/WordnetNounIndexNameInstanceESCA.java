package org.swtk.commons.dict.wordnet.index.name.instance.e.s.c.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceESCA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"escadrille\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08236844\", \"08237288\"]}");
	add("{\"term\":\"escalade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00326457\"]}");
	add("{\"term\":\"escalader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10082592\"]}");
	add("{\"term\":\"escalation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00367672\"]}");
	add("{\"term\":\"escalator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03300702\", \"06405443\"]}");
	add("{\"term\":\"escallop\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01968530\", \"07670495\", \"07813617\"]}");
	add("{\"term\":\"escapade\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00430307\", \"00797976\"]}");
	add("{\"term\":\"escape\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"04134734\", \"07451261\", \"11573870\", \"00174132\", \"00205048\", \"00742010\", \"00430425\", \"00059563\"]}");
	add("{\"term\":\"escapee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10082712\"]}");
	add("{\"term\":\"escapement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03301010\"]}");
	add("{\"term\":\"escapism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00430425\"]}");
	add("{\"term\":\"escapist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10082803\"]}");
	add("{\"term\":\"escapologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10082984\"]}");
	add("{\"term\":\"escapology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06258344\"]}");
	add("{\"term\":\"escargot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07798451\"]}");
	add("{\"term\":\"escarole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07747563\"]}");
	add("{\"term\":\"escarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03301257\"]}");
	add("{\"term\":\"escarpment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03301257\", \"09297058\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }