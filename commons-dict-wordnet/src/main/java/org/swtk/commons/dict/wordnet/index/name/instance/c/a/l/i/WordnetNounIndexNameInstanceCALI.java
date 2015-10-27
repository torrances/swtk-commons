package org.swtk.commons.dict.wordnet.index.name.instance.c.a.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCALI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cali\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08750996\"]}");
	add("{\"term\":\"caliber\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05110583\", \"04735326\"]}");
	add("{\"term\":\"calibration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01001187\"]}");
	add("{\"term\":\"calibre\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05110583\", \"04735326\"]}");
	add("{\"term\":\"caliche\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14723602\", \"14869748\"]}");
	add("{\"term\":\"calico\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02943180\"]}");
	add("{\"term\":\"caliculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02158100\"]}");
	add("{\"term\":\"calidris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02031210\"]}");
	add("{\"term\":\"calif\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09906948\"]}");
	add("{\"term\":\"california\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09083238\"]}");
	add("{\"term\":\"californian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09760943\"]}");
	add("{\"term\":\"californium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14657215\"]}");
	add("{\"term\":\"caligula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10899303\"]}");
	add("{\"term\":\"caliper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02943283\"]}");
	add("{\"term\":\"caliph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09906948\"]}");
	add("{\"term\":\"caliphate\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00590728\", \"08568341\", \"15273623\"]}");
	add("{\"term\":\"calisaya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12684948\"]}");
	add("{\"term\":\"calisthenics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00628677\", \"00628904\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }