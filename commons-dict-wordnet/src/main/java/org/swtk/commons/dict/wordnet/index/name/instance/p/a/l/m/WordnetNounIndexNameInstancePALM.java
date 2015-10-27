package org.swtk.commons.dict.wordnet.index.name.instance.p.a.l.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePALM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"palm\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06719615\", \"12602979\", \"13677693\", \"05573329\"]}");
	add("{\"term\":\"palmaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12602129\"]}");
	add("{\"term\":\"palmae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12602129\"]}");
	add("{\"term\":\"palmales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12601978\"]}");
	add("{\"term\":\"palmature\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14354676\"]}");
	add("{\"term\":\"palmer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11241640\"]}");
	add("{\"term\":\"palmetto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12604149\"]}");
	add("{\"term\":\"palmist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10414908\"]}");
	add("{\"term\":\"palmister\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10414908\"]}");
	add("{\"term\":\"palmistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05785827\"]}");
	add("{\"term\":\"palmitin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14998051\"]}");
	add("{\"term\":\"palmyra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12606390\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }