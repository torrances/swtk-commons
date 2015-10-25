package org.swtk.commons.dict.wiktionary.generated.e.s.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryESK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("esky", "{\"term\":\"esky\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027esky\u0027 (brand name) a brand name originally owned by Malley\u0027s Ltd, of Sydney, Australia, from 1952; since genericised. Apparently derived from \u0027eskimo\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An insulated picnic cooler, using ice or refrigerated blocks to keep food and drinks cool\", \"priority\":1}]}, \"synonyms\":{}}");

	add("esker", "{\"term\":\"esker\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Irish\"], \"text\":\"From Irish {{m|ga|eiscir}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A long, narrow, sinuous ridge created by deposits from a stream running beneath a glacier\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1988\u0027\u0027, Robert Phillip Sharp, \u0027Living Ice: Understanding Glaciers and Glaciation\u0027, [https://books.google.com.au/books?id\u003dxz47AAAAIAAJ\u0026amp;pg\u003dPA149\u0026amp;dq\u003d%22esker%22%7C%22eskers%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dF_I9VbCsPMXDmQXkx4CQBg\u0026amp;redir_esc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22esker%22%7C%22eskers%22\u0026amp;f\u003dfalse page 149\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Another unusual ice-contact feature is an \u0027\u0027esker\u0027\u0027, a long, narrow, steep-sided ridge of glaciofluvial sand and gravel inhabiting a glaciated area. \u0027\u0027Eskers\u0027\u0027 tend to follow valleys and lowlands, carefully picking a course between obstacles\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1999\u0027\u0027, L. Clayton, J. W. Attig, D. M. Mickelson, \u0027Tunnel channels formed in Wisconsin during the last glaciation\u0027, David M. Mickelson, John W. Attig (editors), \u0027Glacial Processes, Past and Present\u0027, [https://books.google.com.au/books?id\u003dA3MaaAAD1CEC\u0026amp;pg\u003dPA77\u0026amp;dq\u003d%22esker%22%7C%22eskers%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dF_I9VbCsPMXDmQXkx4CQBg\u0026amp;redir_esc\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22esker%22%7C%22eskers%22\u0026amp;f\u003dfalse page 77\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Another objection to the tunnel-valley interpretation comes from a comparison with \u0027\u0027eskers\u0027\u0027.The \u0027\u0027esker\u0027\u0027 rivers and the tunnel-channel rivers of Wisconsin therefore seem to have been the result of significantly different meltwater regimes\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2001\u0027\u0027, Allan D. Randall, \u0027Hydrogeologic Framework of Stratified-drift Aquifers in the Glaciated Northeastern United States\u0027, US Geological Survey Paper 1415-B, [https://books.google.com.au/books?id\u003dqpPohxczE0gC\u0026amp;pg\u003dSL2-PA37\u0026amp;dq\u003d%22esker%22%7C%22eskers%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dF_I9VbCsPMXDmQXkx4CQBg\u0026amp;redir_esc\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22esker%22%7C%22eskers%22\u0026amp;f\u003dfalse page B37\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"The multiple deltas must have formed sequentially, which led Thompson (1982) to conclude that the \u0027\u0027eskers\u0027\u0027 were built in successive segments\", \"priority\":10}]}, \"synonyms\":{}}");

	add("eskimology", "{\"term\":\"eskimology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Eskimo|ology|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study of the Eskimo people\", \"priority\":1}]}, \"synonyms\":{}}");

	add("eskrima", "{\"term\":\"eskrima\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The traditional martial arts of the Philippines, which emphasize weapon-based fighting with sticks, knives, and various improvised weapons\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }