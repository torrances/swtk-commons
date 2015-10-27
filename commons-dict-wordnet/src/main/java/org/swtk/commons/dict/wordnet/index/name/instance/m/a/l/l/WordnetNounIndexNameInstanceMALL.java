package org.swtk.commons.dict.wordnet.index.name.instance.m.a.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMALL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mall\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03971750\", \"04016581\"]}");
	add("{\"term\":\"mallard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01850447\"]}");
	add("{\"term\":\"mallarme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11171788\"]}");
	add("{\"term\":\"malleability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05029050\"]}");
	add("{\"term\":\"mallee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12356181\"]}");
	add("{\"term\":\"mallet\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03720925\", \"03721208\", \"03721431\"]}");
	add("{\"term\":\"malleus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05333491\"]}");
	add("{\"term\":\"mallon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11171922\"]}");
	add("{\"term\":\"mallophaga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02187989\"]}");
	add("{\"term\":\"mallotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02543770\"]}");
	add("{\"term\":\"mallow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12191102\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }