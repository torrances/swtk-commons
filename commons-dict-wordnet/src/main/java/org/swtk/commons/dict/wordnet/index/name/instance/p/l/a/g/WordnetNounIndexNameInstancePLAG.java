package org.swtk.commons.dict.wordnet.index.name.instance.p.l.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"plage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09416417\"]}");
	add("{\"term\":\"plagianthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12205595\"]}");
	add("{\"term\":\"plagiarisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00751748\"]}");
	add("{\"term\":\"plagiariser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10457029\"]}");
	add("{\"term\":\"plagiarism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00751748\", \"07291863\"]}");
	add("{\"term\":\"plagiarist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10457029\"]}");
	add("{\"term\":\"plagiarization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00751748\"]}");
	add("{\"term\":\"plagiarizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10457029\"]}");
	add("{\"term\":\"plagiocephaly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14491269\"]}");
	add("{\"term\":\"plagioclase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14889467\"]}");
	add("{\"term\":\"plague\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05840263\", \"07331203\", \"08012854\", \"14099961\", \"14162173\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }