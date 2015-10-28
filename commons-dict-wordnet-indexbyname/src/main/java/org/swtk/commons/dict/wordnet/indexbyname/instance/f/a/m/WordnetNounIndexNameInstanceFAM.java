package org.swtk.commons.dict.wordnet.indexbyname.instance.f.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fame\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14462364\", \"14460852\"]}");
	add("{\"term\":\"familiar\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09568300\", \"09965384\", \"10096886\"]}");
	add("{\"term\":\"familiarisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05766379\"]}");
	add("{\"term\":\"familiarity\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00738368\", \"04919417\", \"04662799\", \"04803540\", \"05825271\"]}");
	add("{\"term\":\"familiarization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05766379\"]}");
	add("{\"term\":\"family\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"08244837\", \"08263223\", \"08124465\", \"10256001\", \"07987168\", \"08014145\", \"07986853\", \"08094856\"]}");
	add("{\"term\":\"famine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07330390\", \"14473331\"]}");
	add("{\"term\":\"famishment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14063792\"]}");
	add("{\"term\":\"famotidine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03324803\"]}");
	add("{\"term\":\"famulus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10097284\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }