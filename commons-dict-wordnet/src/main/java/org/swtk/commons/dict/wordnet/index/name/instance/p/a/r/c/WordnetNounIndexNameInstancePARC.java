package org.swtk.commons.dict.wordnet.index.name.instance.p.a.r.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePARC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"parcae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09588463\"]}");
	add("{\"term\":\"parcel\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08024575\", \"08691133\", \"01087022\", \"03876761\"]}");
	add("{\"term\":\"parceling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01085569\"]}");
	add("{\"term\":\"parcellation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00386972\"]}");
	add("{\"term\":\"parcelling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01085569\"]}");
	add("{\"term\":\"parcheesi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00506626\"]}");
	add("{\"term\":\"parchesi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00506457\"]}");
	add("{\"term\":\"parchisi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00506457\"]}");
	add("{\"term\":\"parchment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14783182\", \"15000338\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }