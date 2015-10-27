package org.swtk.commons.dict.wordnet.index.name.instance.m.o.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMONG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"monger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10740102\"]}");
	add("{\"term\":\"monggo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07741018\", \"12599160\"]}");
	add("{\"term\":\"mongo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13730853\"]}");
	add("{\"term\":\"mongol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09664219\"]}");
	add("{\"term\":\"mongolia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08991028\", \"08991230\"]}");
	add("{\"term\":\"mongolian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06941616\", \"09664219\"]}");
	add("{\"term\":\"mongolianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14183105\"]}");
	add("{\"term\":\"mongolic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06941616\"]}");
	add("{\"term\":\"mongolism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14183105\"]}");
	add("{\"term\":\"mongoloid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10348226\", \"10348407\"]}");
	add("{\"term\":\"mongoose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02140201\"]}");
	add("{\"term\":\"mongrel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02087513\", \"02807938\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }