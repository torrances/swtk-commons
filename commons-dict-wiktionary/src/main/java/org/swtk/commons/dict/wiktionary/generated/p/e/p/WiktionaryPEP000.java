package org.swtk.commons.dict.wiktionary.generated.p.e.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPEP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("peperoncini", "{\"term\":\"peperoncini\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Italian\"], \"text\":\"From Italian \u0027lang\u003dit\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A spicy variety of pepper used in Greek and Italian cuisin\", \"priority\":1}]}, \"synonyms\":{}}");

	add("peplomer", "{\"term\":\"peplomer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|peplos|mer|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"how viruses attach to cells; spike\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pepper", "{\"term\":\"pepper\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"Latin\", \"Sanskrit\"], \"text\":\"From Old english (ca. 450-1100) {{m|ang|piper}}, from Latin {{m|la|piper}}, from an source; compare Sanskrit {{m|sa|sc\u003dDeva|पिप्पलि|tr\u003dpippali||long pepper}}. The name was given to the capsicum fruit because of its unusual spicy taste, not unlike the European spice.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A plant of the family Piperaceae\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A spice prepared from the fermented, dried, unripe berries of this plant\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A fruit of the capsicum: red, green, yellow or white, hollow and containing seeds, and in very spicy and mild varieties\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A game used by baseball players to warm up where fielders standing close to a batter rapidly return the batted ball to be hit agai\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Some ballparks have signs saying \u0026quot;No \u0027\u0027pepper\u0027\u0027 games\u0026quot\", \"priority\":5}]}, \"synonyms\":{}}");

	add("pepperwort", "{\"term\":\"pepperwort\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|pepper|wort|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several species of perennial plant in the genus \u0027Lepidium\u0027 (originally specifically dittander, ), which is a member of the mustard and cabbage family\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1653\u0027\u0027, \u0027The English Physician Enlarged\u0027, Folio Society 2007, p. 219\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Our common \u0027\u0027Pepperwort\u0027\u0027 sends forth somewhat long and broad leaves, of a light bluish-green colour, finely dented about the edges and pointed at the ends\", \"priority\":3}]}, \"synonyms\":{}}");

	add("peppiness", "{\"term\":\"peppiness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|peppy|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being peppy\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"I am not generally known for my \u0027\u0027peppiness\u0027\u0027 prior to my first cup of coffee in the morning\", \"priority\":2}]}, \"synonyms\":{}}");

	add("peptidome", "{\"term\":\"peptidome\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|peptide|genome|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The complete set of peptides encoded by a particular genome, or present within a particular cell type or organism\", \"priority\":1}]}, \"synonyms\":{}}");

	add("peptidomics", "{\"term\":\"peptidomics\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The branch of molecular biology that studies the set of peptides of an organism\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }