package org.swtk.commons.dict.wordnet.index.name.instance.v.a.c.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVACC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vaccaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11838984\"]}");
	add("{\"term\":\"vaccina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14381427\"]}");
	add("{\"term\":\"vaccinating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00825715\"]}");
	add("{\"term\":\"vaccination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14387711\", \"00825545\"]}");
	add("{\"term\":\"vaccinator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10227133\"]}");
	add("{\"term\":\"vaccine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04524830\"]}");
	add("{\"term\":\"vaccinee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10764113\"]}");
	add("{\"term\":\"vaccinia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14286384\", \"14381427\"]}");
	add("{\"term\":\"vaccinium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12265989\"]}");
	add("{\"term\":\"vaccinum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04524830\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }