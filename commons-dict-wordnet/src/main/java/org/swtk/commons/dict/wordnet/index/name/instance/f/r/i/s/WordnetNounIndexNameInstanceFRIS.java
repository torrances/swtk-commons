package org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFRIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"frisbee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03402783\"]}");
	add("{\"term\":\"frisch\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11002866\", \"11003003\", \"11003168\"]}");
	add("{\"term\":\"frisia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08971550\"]}");
	add("{\"term\":\"frisian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06967982\", \"09719314\"]}");
	add("{\"term\":\"frisk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00947876\"]}");
	add("{\"term\":\"friskiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04657192\"]}");
	add("{\"term\":\"frisking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00947876\"]}");
	add("{\"term\":\"frisson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07535351\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }