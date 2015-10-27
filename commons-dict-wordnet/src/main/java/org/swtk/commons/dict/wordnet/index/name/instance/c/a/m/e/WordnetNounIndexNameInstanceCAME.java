package org.swtk.commons.dict.wordnet.index.name.instance.c.a.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"camel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02439767\"]}");
	add("{\"term\":\"camelhair\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02945915\"]}");
	add("{\"term\":\"camelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12950163\"]}");
	add("{\"term\":\"camelidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02439444\"]}");
	add("{\"term\":\"camelina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11901079\"]}");
	add("{\"term\":\"camellia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12950163\"]}");
	add("{\"term\":\"camelopard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02441664\"]}");
	add("{\"term\":\"camelot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08575826\"]}");
	add("{\"term\":\"camelpox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14285655\"]}");
	add("{\"term\":\"camelus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02439624\"]}");
	add("{\"term\":\"camembert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07868809\"]}");
	add("{\"term\":\"cameo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02946032\"]}");
	add("{\"term\":\"camera\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04412132\", \"02946154\"]}");
	add("{\"term\":\"cameraman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09908991\"]}");
	add("{\"term\":\"cameroon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08735042\", \"09196520\"]}");
	add("{\"term\":\"cameroonian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09715852\"]}");
	add("{\"term\":\"cameroun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08735042\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }