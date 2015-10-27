package org.swtk.commons.dict.wordnet.index.name.instance.g.l.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"glaser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11021844\"]}");
	add("{\"term\":\"glasgow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08913198\"]}");
	add("{\"term\":\"glasnost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06672142\"]}");
	add("{\"term\":\"glass\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"03443585\", \"03694158\", \"03759824\", \"03338074\", \"13789379\", \"03443167\", \"14905454\"]}");
	add("{\"term\":\"glassblower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10151555\"]}");
	add("{\"term\":\"glasses\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04279164\"]}");
	add("{\"term\":\"glassful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13789379\"]}");
	add("{\"term\":\"glasshouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03462844\"]}");
	add("{\"term\":\"glassmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10151942\"]}");
	add("{\"term\":\"glassware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03443988\"]}");
	add("{\"term\":\"glasswork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03443988\"]}");
	add("{\"term\":\"glassworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10151665\"]}");
	add("{\"term\":\"glassworks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03444184\"]}");
	add("{\"term\":\"glasswort\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11854741\", \"11855123\"]}");
	add("{\"term\":\"glaswegian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09768473\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }