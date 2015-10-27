package org.swtk.commons.dict.wordnet.index.name.instance.s.a.c.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSACC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"saccade\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00336814\", \"00339097\"]}");
	add("{\"term\":\"saccharase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14945760\"]}");
	add("{\"term\":\"saccharide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14816873\"]}");
	add("{\"term\":\"saccharin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07875118\"]}");
	add("{\"term\":\"saccharinity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05001792\"]}");
	add("{\"term\":\"saccharomyces\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13046181\"]}");
	add("{\"term\":\"saccharomycetaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13045957\"]}");
	add("{\"term\":\"saccharose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15087345\"]}");
	add("{\"term\":\"saccharum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12152816\"]}");
	add("{\"term\":\"sacco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11297670\"]}");
	add("{\"term\":\"saccule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05330118\"]}");
	add("{\"term\":\"sacculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05330118\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }