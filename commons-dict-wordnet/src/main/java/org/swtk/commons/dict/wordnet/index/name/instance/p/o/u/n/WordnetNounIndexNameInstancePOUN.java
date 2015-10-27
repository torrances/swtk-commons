package org.swtk.commons.dict.wordnet.index.name.instance.p.o.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pounce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01260841\"]}");
	add("{\"term\":\"pound\", \"synsetCount\":14, \"upperType\":\"NOUN\", \"ids\":[\"01177806\", \"04000061\", \"06822614\", \"11264540\", \"13669802\", \"13715746\", \"13716122\", \"13716762\", \"13717041\", \"13717525\", \"13717779\", \"13742407\", \"13708765\", \"13742201\"]}");
	add("{\"term\":\"poundage\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00087117\", \"05035514\", \"13344229\", \"13345934\"]}");
	add("{\"term\":\"poundal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13669615\"]}");
	add("{\"term\":\"pounder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03925552\", \"13669996\"]}");
	add("{\"term\":\"pounding\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01177806\", \"07416326\", \"07425126\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }