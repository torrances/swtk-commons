package org.swtk.commons.dict.wiktionary.generated.l.o.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLOZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lozenge", "{\"term\":\"lozenge\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"French\", \"old french (842-ca. 1400)\"], \"text\":\"From Old french (842-ca. 1400) {{m|fro|losenge||rhombus}} (compare French {{m|fr|losange}}), from {{m|fro|*lose||flag-stone}}, from {{m|la|lausiae||pebbles in a stone-quarry}}, from Gaulish {{m|cel-gau|*lawsyā}}, from Proto-celtic {{m|cel-pro|*laws||stone}}, from Proto-indo-european {{m|ine-pro|*leh₁us||stone}}. Cognate with Spanish {{m|es|losa||square tile}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A quadrilateral with sides of equal length (rhombus), having two acute and two obtuse angles\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1658\u0027\u0027, Sir Thomas Browne, \u0027The Garden of Cyrus\u0027, Folio Society 2007, p. 167\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Wherein the \u0027decussis\u0027 is made within a longilaterall square, with opposite angles, acute and obtuse at the intersection; and so upon progression making a \u0027Rhombus\u0027 or \u0027\u0027Lozenge\u0027\u0027 figuration\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, \u0027The Earth\u0027, Folio Society 2011, p. 14\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The floor is constructed from marble \u0027\u0027lozenges\u0027\u0027 and triangles of every imaginable hue: yellow and pink and all manner of mottled and blotched shades, framed in white\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A small tablet (originally diamond-shaped) or medicated sweet used to ease a\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"title\u003d[http://openlibrary.org/works/OL1097634W The Mirror and the passage\u003dOne saint\u0027s day in mid-term a certain newly appointed suffragan-bishop came to the school chapel, and there preached on “The Inner Life.”\u0026amp;nbsp; He at once secured attention by his informal method, and when presently the coughing of Jarvis […] interrupted the sermon, he altogether captivated his audience with a remark about cough \u0027\u0027lozenges\u0027\u0027 being cheap and easily procurable\", \"priority\":7}]}, \"synonyms\":{\"list\":[{\"text\":\"diamond\", \"synonymQualifier\":\"INFORMAL\"}]}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }