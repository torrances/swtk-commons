package org.swtk.commons.dict.wordnet.index.name.instance.l.i.m.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIMN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"limner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10475185\"]}");
	add("{\"term\":\"limning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03178190\"]}");
	add("{\"term\":\"limnobium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12634729\"]}");
	add("{\"term\":\"limnocryptes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02035300\"]}");
	add("{\"term\":\"limnodromus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02035569\"]}");
	add("{\"term\":\"limnologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10282843\"]}");
	add("{\"term\":\"limnology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06129924\"]}");
	add("{\"term\":\"limnos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08808600\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }