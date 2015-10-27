package org.swtk.commons.dict.wordnet.index.name.instance.a.l.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"alum\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02703481\", \"09805779\", \"14652297\", \"14652485\"]}");
	add("{\"term\":\"alumbloom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12819044\"]}");
	add("{\"term\":\"alumina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14848114\"]}");
	add("{\"term\":\"aluminate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14848310\"]}");
	add("{\"term\":\"aluminium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14651998\"]}");
	add("{\"term\":\"aluminum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14651998\"]}");
	add("{\"term\":\"alumna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09805779\"]}");
	add("{\"term\":\"alumnus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09805779\"]}");
	add("{\"term\":\"alumroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12819044\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }